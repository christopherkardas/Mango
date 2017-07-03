package io.github.tonnyl.mango.auth

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import io.github.tonnyl.mango.R
import io.github.tonnyl.mango.data.repository.AccessTokenRepository
import io.github.tonnyl.mango.shots.MainActivity
import io.github.tonnyl.mango.util.Constants

/**
 * Created by lizhaotailang on 2017/6/24.
 */

class AuthActivity: AppCompatActivity() {

    private var mFragment: AuthFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Init the database.
        AccessTokenRepository.init(this)

        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean(Constants.IS_USER_LOGGED_IN, false)) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
            return
        }

        setContentView(R.layout.container)

        if (savedInstanceState != null) {
            mFragment = supportFragmentManager.getFragment(savedInstanceState, AuthFragment::class.java.simpleName) as AuthFragment?
        } else {
            mFragment = AuthFragment.newInstance()
        }
        supportFragmentManager.beginTransaction()
                .add(R.id.container, mFragment, AuthFragment::class.java.simpleName)
                .commit()

        AuthPresenter(mFragment!!)

        mFragment!!.handleAuthCallback(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        mFragment!!.handleAuthCallback(intent)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        if (mFragment!!.isAdded) {
            supportFragmentManager.putFragment(outState, AuthFragment::class.java.simpleName, mFragment)
        }
    }

}
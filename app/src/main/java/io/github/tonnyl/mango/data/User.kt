package io.github.tonnyl.mango.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by lizhaotailang on 2017/6/25.
 * {
 * "id" : 1,
 * "name" : "Dan Cederholm",
 * "username" : "simplebits",
 * "html_url" : "https://dribbble.com/simplebits",
 * "avatar_url" : "https://d13yacurqjgara.cloudfront.net/users/1/avatars/normal/dc.jpg?1371679243",
 * "bio" : "Co-founder &amp; designer of <a href=\"https://dribbble.com/dribbble\">@Dribbble</a>. Principal of SimpleBits. Aspiring clawhammer banjoist.",
 * "location" : "Salem, MA",
 * "links" : {
 * "web" : "http://simplebits.com",
 * "twitter" : "https://twitter.com/simplebits"
 * },
 * "buckets_count" : 10,
 * "comments_received_count" : 3395,
 * "followers_count" : 29262,
 * "followings_count" : 1728,
 * "likes_count" : 34954,
 * "likes_received_count" : 27568,
 * "projects_count" : 8,
 * "rebounds_received_count" : 504,
 * "shots_count" : 214,
 * "teams_count" : 1,
 * "can_upload_shot" : true,
 * "type" : "Player",
 * "pro" : true,
 * "buckets_url" : "https://dribbble.com/v1/users/1/buckets",
 * "followers_url" : "https://dribbble.com/v1/users/1/followers",
 * "following_url" : "https://dribbble.com/v1/users/1/following",
 * "likes_url" : "https://dribbble.com/v1/users/1/likes",
 * "shots_url" : "https://dribbble.com/v1/users/1/shots",
 * "teams_url" : "https://dribbble.com/v1/users/1/teams",
 * "created_at" : "2009-07-08T02:51:22Z",
 * "updated_at" : "2014-02-22T17:10:33Z"
 * }
 */

@Entity(tableName = "user")
class User {

    @ColumnInfo(name = "name")
    @SerializedName("name")
    @Expose
    var name: String = ""

    @ColumnInfo(name = "username")
    @SerializedName("username")
    @Expose
    var username: String = ""

    @ColumnInfo(name = "html_url")
    @SerializedName("html_url")
    @Expose
    var htmlUrl: String = ""

    @ColumnInfo(name = "avatar_url")
    @SerializedName("avatar_url")
    @Expose
    var avatar_url: String = ""

    @ColumnInfo(name = "bio")
    @SerializedName("bio")
    @Expose
    var bio: String = ""

    @ColumnInfo(name = "location")
    @SerializedName("location")
    @Expose
    var location: String? = ""

    @Embedded
    @SerializedName("links")
    @Expose
    var links: Links = Links()

    @ColumnInfo(name = "buckets_count")
    @SerializedName("buckets_count")
    @Expose
    var bucketsCount: Int = 0

    @ColumnInfo(name = "comments_received_count")
    @SerializedName("comments_received_count")
    @Expose
    var commentsReceivedCount: Int = 0

    @ColumnInfo(name = "followers_count")
    @SerializedName("followers_count")
    @Expose
    var followersCount: Int = 0

    @ColumnInfo(name = "followings_count")
    @SerializedName("followings_count")
    @Expose
    var followingsCount: Int = 0

    @ColumnInfo(name = "likes_count")
    @SerializedName("likes_count")
    @Expose
    var likesCount: Int = 0

    @ColumnInfo(name = "likes_received_count")
    @SerializedName("likes_received_count")
    @Expose
    var likesReceivedCount: Int = 0

    @ColumnInfo(name = "projects_count")
    @SerializedName("projects_count")
    @Expose
    var projectsCount: Int = 0

    @ColumnInfo(name = "rebounds_received_count")
    @SerializedName("rebounds_received_count")
    @Expose
    var reboundsReceivedCount: Int = 0

    @ColumnInfo(name = "shots_count")
    @SerializedName("shots_count")
    @Expose
    var shotsCount: Int = 0

    @ColumnInfo(name = "teams_count")
    @SerializedName("teams_count")
    @Expose
    var teamsCount: Int = 0

    @ColumnInfo(name = "can_upload_shot")
    @SerializedName("can_upload_shot")
    @Expose
    var canUploadShot: Boolean = false

    @ColumnInfo(name = "type")
    @SerializedName("type")
    @Expose
    var type: String = ""

    @ColumnInfo(name = "pro")
    @SerializedName("pro")
    @Expose
    var pro: Boolean = false

    @ColumnInfo(name = "buckets_url")
    @SerializedName("buckets_url")
    @Expose
    var bucketsUrl: String = ""

    @ColumnInfo(name = "followers_url")
    @SerializedName("followers_url")
    @Expose
    var followersUrl: String = ""

    @ColumnInfo(name = "following_url")
    @SerializedName("following_url")
    @Expose
    var following_url: String = ""

    @ColumnInfo(name = "likes_url")
    @SerializedName("likes_url")
    @Expose
    var likesUrl: String = ""

    @ColumnInfo(name = "shots_url")
    @SerializedName("shots_url")
    @Expose
    var shotsUrl: String = ""

    @ColumnInfo(name = "teams_url")
    @SerializedName("teams_url")
    @Expose
    var teamsUrl: String? = ""

    @ColumnInfo(name = "created_at")
    @SerializedName("created_at")
    @Expose
    var createdAt: String = ""

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    @Expose
    var updatedAt: String = ""

    @ColumnInfo(name = "id")
    @field: PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Long = 0L

}
package hu.bme.aut.bloggr.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime




@RequiresApi(Build.VERSION_CODES.O)
class Post (val owner : User) {
    var title : String = String()
    var subtitle : String = String()
    var text : String = String()
    var time: LocalDateTime = LocalDateTime.now()
    val tags: ArrayList<Tag> = ArrayList<Tag>()



}
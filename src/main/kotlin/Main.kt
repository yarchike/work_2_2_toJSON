import com.google.gson.Gson
import java.io.File

fun main() {
    val fileName = "posts.json"
    val fileNameSponser = "posts_sponser.json"
    File(fileName).writeText(Gson().toJson(PostData.getDataBase()))
    File(fileNameSponser).writeText(Gson().toJson(PostData.getDataBaseSponser()))

}

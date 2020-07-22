import com.google.gson.Gson
import java.io.File

fun main() {
    val fileName = "posts.json"
    File(fileName).writeText(Gson().toJson(PostData.getDataBase()))

}

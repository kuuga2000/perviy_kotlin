package auto;

sealed class MarsUiState {
    data class Success(val photos: String) : MarsUiState()
    object Error : MarsUiState()
    object Loading : MarsUiState()
}

fun main(args: Array<String>) {
    val s = MarsUiState.Success(
        "Success: ${20} Mars photos retrieved"
    )
    val t:String = s.photos
    println(t)
}
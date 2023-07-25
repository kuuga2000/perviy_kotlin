fun main(args: Array<String>) {
    var name: String = "Pudge";
    //name = null

    //? its mean that variable can be nullable
    var nullAbleName: String? = "am I null?"
    //nullAbleName = null

    //few ways how to check null

    //null check with if
    var length = 0
    if (nullAbleName != null) {
        length = nullAbleName.length
    } else {
        length = -1
    }
    println(length)

    val str_length = if (nullAbleName != null) nullAbleName.length else -1
    println(str_length)

    //Second method Safe Call Operator ?
    println(nullAbleName?.length)

    println("==================")

    //Third method is Elvis Operator
    val len = nullAbleName?.length ?: -1
    val noName = nullAbleName ?: "No Data"
    println(len)
    println(noName)

    //!!
    println(nullAbleName!!.length)


}
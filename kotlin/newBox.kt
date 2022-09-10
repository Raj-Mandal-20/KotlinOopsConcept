

class newBox(
    val length:Int,
    val width:Int,
    val height:Int) {

    init {
        println("Initial Block Called")
        println("volume =  ${length*width*height}")
    }

    // secondary constructor
    constructor():this(2,2,2){
        println("Secondary Constructor Called")
    }

}
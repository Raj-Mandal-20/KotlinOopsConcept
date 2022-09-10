

// First to 4rd lecture

class Box {
    private var length:Int = 10
    val width : Int = 20
    val height : Int = 5

    // val means immutable

    init {
        println("default")
    }
    val volume
        get() = length * width*height

    var changeLength:Int = 0
        set(value){
            if(value < 10){
                println("Don't Need to change the value")
            }else{
                field = value
                println(field)
            }
        }


    fun getVolume(){

        println(length*width*height)

    }
    fun fillContent(){
        println("Box is Filled")
    }
    fun open(){
        println("Box open")
    }
}
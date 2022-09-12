class PrimiumCoffieMachine(
    private val price: Double,
    private val color:String
):BaseCoffieMachine(price, color) {

    init {
        println("This is an Premium Coffee Machine")


    }
    fun makePriminumCoffie(){
        makeCoffie()
    }
}
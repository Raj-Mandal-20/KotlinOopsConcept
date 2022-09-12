open class BaseCoffieMachine (
        private val price: Double,
        private val color :String
        ){

    init{
        println("Prize of the Coffie is $price and Flavour $color")

    }
    protected fun makeCoffie(){
        println("Make Normal a Coffie ☕")

    }

}
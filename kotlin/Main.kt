
fun main(){


    // Lecture 1 & 2 // How class works in kotlin
    val box1 = Box()
    val box2 = Box()

    box1.fillContent()
    box2.open()
//    box1.length = 5
//    println(box2.length)
    println("heigh1 : ${box1.height}")

    // Lecture 3 // get() and set() function use
    println(box1.volume)
    box2.getVolume()
    box1.changeLength = 15

    // Lecture 4// visibility modifier

    /*
    * public : default , canbe accessed anywhere
    * internal : available everywhere in the same module
    * private : available only in the defined class
    * protected : same as private but available inside subclass or child class
    *
    */

    // Lecture 5 / Constructor // primary constructor // secondary constructor // init block




}

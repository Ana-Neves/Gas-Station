fun fuel() {
    println("Which type of fuel do you want?\nG - Gas\nA - Alcohol")
    val typeOfFuel = readLine()!!.toString()

    println("How much liters do you want?")
    val liters = readLine()!!.toInt()

    val price = (liters * 6)

    if (typeOfFuel.equals("a", true) && liters <= 20){
        println("The total value is: ${price - (price * 3) / 100}")
    } else if (typeOfFuel.equals("a", true) && liters >= 20){
        println("The total value is: ${price - (price * 5)/ 100}")
    } else if (typeOfFuel.equals("g", true) && liters <= 20){
        println("The total value is: ${price - (price * 4)/ 100}")
    } else if (typeOfFuel.equals("g", true) && liters >= 20){
        println("The total value is: ${price - (price * 6)/ 100}")
    } else{
        println("ops! something went wrong!")
    }
}



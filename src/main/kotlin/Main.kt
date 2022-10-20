fun main() {
    val list = mutableListOf<Animals>()
    val animals = Animals("Тип", "Ест:")
    val meatEaters = MeatEaters("Плотоядные", "Мясо")
    val vegans = Vegans("Травоядные", "Растения")
    list.add(animals)
    list.add(meatEaters)
   list.add(vegans)


   print(list)
}



open class Animals(var name: String, var food: String) {
    override fun toString(): String {
        return "Animals(name='$name', food='$food')"
    }
}

 class MeatEaters(name: String,food: String) : Animals(name,food) {
    override fun toString(): String {
        return "MeatEaters(name='$name', food='$food')"
    }
}



 class Vegans(name: String,food: String) : Animals (name, food) {
    override fun toString(): String {
        return "Vegans(food='$food' ${super.toString()})"
    }
}


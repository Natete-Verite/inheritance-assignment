fun main(){
    var car = Car("mercedes","maybach 6 Cabriolet","black",4)
    car.carry(5)
    car.carry(3)
    car.identity()
    car.calculateParkingFee(3)

    var bus = Bus("Hyundai","Hyundai 12", "white",18)
    bus.maxTripFare(30.00)
    bus.carry(20)
    bus.carry(10)
    bus.identity()
    bus.calculateParkingFee(3)
}
 open class Car( var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people:Int){
      var x= people-capacity
        if (people <=  capacity ){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people ")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFee(hours:Int):Int{
        var parkingFee = 20
         parkingFee  *= hours
        println(parkingFee)
        return parkingFee
    }
}
class Bus(make: String, model: String,color: String,capacity: Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double): Double {
        var tripFare = capacity * fare
        println(tripFare)
        return tripFare
    }
    override fun calculateParkingFee(hours: Int): Int {
        var fee = hours*capacity
        println(fee)
        return fee
    }

}

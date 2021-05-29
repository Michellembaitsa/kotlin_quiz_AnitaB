fun main(){
    var acc=CurrentAccount("123C","Micana tradings",1000.00)
    println(acc.deposit(1000.00))
    println(acc.withdraw(500.00))
    acc.details()
    var save=SavingsAccount("678J","Dodoma artisans",5000.00,2)
    println(save.deposit(1000.00))
    println(save.withdraw(500.00))
    println(save.withdraw(1500.00))
    println(save.withdraw(1000.00))
    save.details()


}
//data class Book(var title:String,var Author:String,var pages:String)
//fun books(x:List<Book>){
//  var x= mutableListOf<Book>()
//
//}
open class CurrentAccount(var accNo:String,var accName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance+=amount
        return balance
    }
    open fun withdraw(amount:Double):Double{
        balance-=amount
        return balance
    }
    fun details(){
        println("Account number $accNo with balance $balance is operated by $accName")
    }
}
class SavingsAccount(accNo:String,accName:String,balance:Double,var withdrawals:Int):CurrentAccount(accNo, accName, balance){
   override fun withdraw(amount: Double):Double {
       if (withdrawals < 4) {
           balance -= withdrawals


       }
       return balance
   }
}
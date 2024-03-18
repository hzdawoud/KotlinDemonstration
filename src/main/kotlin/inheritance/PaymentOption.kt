package inheritance

import java.beans.beancontext.BeanContext

//used when you have home page with multiple different behavior card
enum class PaymentOption(val id: String) {
    CASH("cash") {
        override fun startPayment(context: BeanContext) {
            TODO("Not yet implemented")
        }
    },
    CARD("card") {
        override fun startPayment(context: BeanContext) {
            TODO("Not yet implemented")
        }
    },
    TRANSFER("transfer") {
        override fun startPayment(context: BeanContext) {
            TODO("Not yet implemented")
        }
    };

    abstract fun startPayment(context: BeanContext)
}
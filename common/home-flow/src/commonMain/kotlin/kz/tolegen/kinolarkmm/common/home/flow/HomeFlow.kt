package kz.tolegen.kinolarkmm.common.home.flow

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface HomeFlow {

    val childStack: Value<ChildStack<*, Child>>

    val models: Value<Model>

    fun bottomNavItemClicked(index: Int)

    sealed class Child {
        object Stub: Child()
    }

    sealed class Output {
        object Stub: Output()
    }

    data class Model(
        val selectedBottomNavItem: Int
    )
}
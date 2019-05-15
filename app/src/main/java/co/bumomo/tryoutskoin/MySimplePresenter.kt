package co.bumomo.tryoutskoin

class MySimplePresenter(val repo: DataProvider) {

    fun sayHello() = "${repo.provideText()} from $this"
}
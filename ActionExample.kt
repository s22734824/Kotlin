lateinit var testlist:MutableList<()->Unit>
testlist.add(::Test)
testlist.add(::Test)
testlist.add(::Test)
testlist.add(::Test)
testlist.add(::Test)
testlist.add(::Test)


for(action in testlist)
{
  action()
}
fun Test()
{
println("Test")
}

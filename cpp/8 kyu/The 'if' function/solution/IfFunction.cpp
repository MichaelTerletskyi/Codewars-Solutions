void _if(bool b, std::function<void(void)> func1, std::function<void(void)> func2)
{
   b ? func1() : func2();
}
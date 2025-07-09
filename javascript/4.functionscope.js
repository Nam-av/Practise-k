//Variable decalred with var inside a function
function functionscopeExample(){
    var functionscoped="Accessible within this function";

if(true)
{
    var stillfunctionscoped='Still accessible within function';
}
    console.log(functionscoped)
    console.log(stillfunctionscoped)
}

functionscopeExample()
console.log(functionscoped)
console.log(stillfunctionscoped)



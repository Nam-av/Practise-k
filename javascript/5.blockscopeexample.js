//Variables declared with let or const
function blockscopeExample(){
    //let functionscoped="Accessible within this function";

if(true)
{
    var blockscoped='Still accessible within function';
    console.log(blockscoped)
}
    console.log(functionscoped)
    
}

//blockscopeExample()
//console.log(functionscoped)
blockscopeExample()
//console.log(blockscoped)

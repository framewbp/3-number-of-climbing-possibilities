fun main() {
    val inputSteps = 2
    //val inputSteps = 3
    //val inputSteps = 46
    
    if(inputSteps >= 1 && inputSteps <= 45){
        val distinctWays = distinctWaysToClimb(inputSteps)
    	println("Input number of step:  $inputSteps")
    	println("Output: $distinctWays")
    }
    else
    	println("Input invalid steps!!")
}

fun distinctWaysToClimb(totalSteps: Int): Int {
    if(totalSteps < 1){
        return 0
    }else if(totalSteps == 1){
        return 1
    }else{
        var prevStepWays = 1
    	var currStepWays = 2
    
    	for (step in 3..totalSteps) {
        	val countStepWays = currStepWays
        	currStepWays = prevStepWays + currStepWays
        	prevStepWays = countStepWays
    	}
    
    	return currStepWays
    }
}
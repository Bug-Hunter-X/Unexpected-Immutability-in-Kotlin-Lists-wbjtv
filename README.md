# Kotlin Immutability Bug

This repository demonstrates a common error in Kotlin related to immutability.  Kotlin's collections are immutable by default, meaning you cannot modify them after creation.  Attempting to do so will result in an exception.

The `bug.kt` file shows the problematic code. The `bugSolution.kt` file shows a corrected version.

## How to Reproduce

1. Clone this repository.
2. Compile and run `bug.kt`.  You'll see an exception.
3. Then run `bugSolution.kt` for the corrected behavior.

## Solution

To modify a list, you need to create a new list with the desired changes.
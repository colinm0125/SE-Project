# SE-Project
Software Engineering Project

![<Alt text for image>](https://github.com/colinm0125/SE-Project/assets/113200930/a79bc0f0-1c29-4309-ad6d-9a890cdfb077)

Project will be computing the prime summation of an inputted integer, and will return the # of varitions of prime summations.
Example:
Input 6:
Prime implimentations: 2+2+2, 3+3.
Output: 2

Created an upper bound for the threading to be 40 since the computation
is memory intensive.

PerformanceTest in the test folder was used to test an average speed for a definitive computation for both the coordination 
componant and the compute engine. The coordination componant ran at 4ms and the compute engine at 18ms.

Added changes to ComputeEngineAPI and PrimeSummation, which resulted in same speed for the compute engine but made it more 
memory efficient, and improved coordnation to now run typically at 2-3ms.

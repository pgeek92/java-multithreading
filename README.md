=====================
# java-multithreading

------------------
## Thread creation
* There are four ways, by which we can create threads
	1. By extending Thread class[Demo1]()
	2. By implementing Runnable interface [Demo2]()
	3. By using annonymous block [Demo3]()
	4. Using Thread pools & Executor Services
* Implementing a Runnable interface is a better way to create threads, because we can implementing other interfaces or can extend multiple classes along with it
* If I'll again start a thread start() method, which is already completed it's execution then it will throw __java.lang.IllegalStateException__
* We can't directly call run method to start a thread, you need to call start method to create a new thread, if you call run method directly, it won't create a new threads

-------------------------
## Thread synchronization
* Java __volatile__ keyword is used to store data in *computer's main memory*. 
* More precisely that means, that every read of a __volatile__ variable will be read from the computer's main memory, and not from the CPU cache, and that every write to a __volatile__ variable will be written to main memory, and not just to the CPU cache.
* Java __volatile__ keyword gaurantees visibility of changes to variables across threads.
* __volatile__ keyword is not always enough, it may lead to *race condition* (where two threads compete for the same resource, where the sequence in which the resource is accessed is significant), a code section that leads to the race conditions is called a *critical section*
* __volatile__ is enough, if we use __synchronized__ block or __Atomic__ datatypes.
[refer this link](http://tutorials.jenkov.com/java-concurrency/volatile.html)
[refer this link](https://www.geeksforgeeks.org/volatile-keyword-in-java/)


# Singleton Pattern

## Why do we need Singleton?
There are many objects we only need one of: thread pools, caches, dialog boxes, objects that handlepreferences and registry settings, objects used for logging, and objects that act as device drivers to deviceslike printers and graphics cards. In fact, for many of these types of objects, if we were to instantiate more than one we’d run into all sorts of problems like incorrect program behavior, overuse of resources, or inconsistent results.<br>

## You may think this way:-
Okay, so maybe there are classes that should only be instantiated once, but do I need a whole 
separate pattern for this? Can’t I just do this by convention or by global variables? You know, like in Java, I could do it with a static variable.

## Global Variable is a wrong choice?
In many ways, the Singleton Pattern is a convention for ensuring one and only one object is instantiated for a given class. The Singleton Pattern also gives us a global point of access, just like a global variable, but without the downsides.<br>

<b>Hmmm..What downsides?</b><br>

Well, here’s one example: if you assign an object to a global variable, then that object might be created when your application begins. Right? What if this object is resource intensive and your application never ends up using it? As you will see, with the Singleton Pattern, we can create our objects only when they are needed.<br>

## Ways to implement:

In Java, the Singleton pattern is often implemented using one of the following approaches:

1. Eager Initialization: The instance is created when the class is loaded. This approach ensures thread safety but may create the instance even if it's not needed.

2. Lazy Initialization: The instance is created only when it's first requested. This approach is more resource-efficient but requires careful handling of thread safety, especially in a multi-threaded environment.

3. Bill Pugh Singleton: This approach combines the benefits of lazy initialization and thread safety by using an inner static class to hold the instance.

4. Enum Singleton: In modern Java, you can implement a Singleton using an enum, which is both lazy-loaded and thread-safe.

Here we will discuss Lazy Initialization and Bill Pugh Singleton 
# IN1010 V23 - Obligatory Assignment 3

## Overview
This repository contains the solution to the *Obligatory Assignment 3* for the course IN1010, as part of the *V23* semester. The assignment focuses on implementing various abstract data structures in Java, including linked lists, stacks, queues, indexed lists, and priority queues. The task is to create these data structures using object-oriented principles, without relying on external libraries such as Java’s built-in `ArrayList` or `LinkedList`. The structures will be used in future assignments, so the code should be clean, efficient, and reusable.

## Project Description
The repository includes the following key components:

- **Interfaces and Classes**: Implementations of different data structures that extend a basic `List<E>` interface, with classes such as `LinkedList`, `Stack`, `Queue`, `IndexedList`, and `PriorityQueue`.
- **Exception Handling**: Custom exception classes for managing invalid indices in lists (`InvalidListIndex`).
- **Unit Tests**: A set of pre-written unit tests to validate the functionality of the data structures implemented.
- **Class and Data Structure Diagrams**: Visual representations of class hierarchies and data structures after specific operations are performed.

## Features

### Data Structures Implemented:
- **Linked List**: A basic linked list implementation, where elements are added to the end and removed from the start (FIFO).
- **Stack**: A stack implementation that follows the LIFO (Last In, First Out) principle.
- **Queue**: A queue implementation based on a linked list, where elements are added to the end and removed from the front (FIFO).
- **Indexed List**: A list that allows indexed access to elements, with methods to insert, retrieve, replace, and remove elements at specific positions.
- **Priority Queue**: A queue that maintains elements in sorted order based on their natural order (Comparable).

### Exception Handling:
- **InvalidListIndex**: A custom exception that is thrown when an invalid index is accessed in any of the lists or when trying to remove from an empty list.

### Unit Testing:
- The solution includes a set of test files to ensure that all data structures and methods are working as expected. The tests include checking edge cases, handling invalid indices, and ensuring proper functionality for the different data structures.
  
### Diagrams:
- **Class Hierarchy**: Visual diagram of the class and interface structure, illustrating inheritance relationships and the design of the solution.
- **Data Structure Diagram**: A diagram representing the state of the data structures after certain operations (e.g., adding/removing elements, replacing values, etc.).

## Structure

- `Liste.java`: Defines the interface for the list data structures.
- `LinkedList.java`: Implements the linked list data structure.
- `Stack.java`: Implements the stack data structure that inherits from `LinkedList`.
- `Queue.java`: Implements the queue data structure that inherits from `LinkedList`.
- `IndexedList.java`: Implements a list with indexed access, extending `LinkedList`.
- `PriorityQueue.java`: Implements a priority queue, also extending `LinkedList` and maintaining a sorted order.
- `InvalidListIndex.java`: Custom exception class for invalid list index access.

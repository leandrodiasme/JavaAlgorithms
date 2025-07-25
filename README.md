# Algorithms & Data Structures Implementation 🚀

Welcome to my comprehensive collection of algorithms and data structures implemented in Java! This repository showcases fundamental computer science concepts with clean, well-documented code designed for learning and interview preparation.

## 📁 Repository Structure

Each algorithm is implemented in its own directory with:
- Complete Java implementation
- Time and space complexity analysis


## 🔍 Implemented Algorithms

### **Search Algorithms** 
- **[Binary Search](./src/BinarySearch.java/)** - Efficiently searches sorted arrays by repeatedly dividing the search interval in half. **Time Complexity:** O(log n) ✅

### **Sorting Algorithms**
- **[Bubble Sort](./bubble-sort/)** - Simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if needed. **Time Complexity:** O(n²)
- **[Merge Sort](./merge-sort/)** - Efficient, stable, divide-and-conquer algorithm that divides the array into halves, sorts them, and merges back together. **Time Complexity:** O(n log n)
- **[Selection Sort](./src/SelectionSort.java/)** - Repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part. **Time Complexity:** O(n²) ✅
- **[Topological Sort](./topological-sort/)** - Linear ordering of vertices in a directed acyclic graph where every directed edge goes from earlier to later vertex. **Time Complexity:** O(V + E)

### **Two Pointer Technique**
- **[Two Pointers](./two-pointers/)** - Technique using two indices to traverse data structures, commonly used for array problems involving pairs or subarrays. **Time Complexity:** O(n)

### **String Algorithms**
- **[Levenshtein Distance](./levenshtein-distance/)** - Dynamic programming algorithm that calculates the minimum number of operations to transform one string into another. **Time Complexity:** O(m × n)

### **Hash-Based Solutions**
- **[Two Sum Problem](./two-sum/)** - Classic problem solved using hash map to find two numbers that add up to a target sum in a single pass. **Time Complexity:** O(n)
- **[Consistent Hashing](./consistent-hashing/)** - Distributed hashing technique that minimizes rehashing when nodes are added or removed from the system. **Time Complexity:** O(log n) for operations

### **Graph Algorithms**
- **[Breadth-First Search (BFS)](./bfs/)** - Graph traversal algorithm that explores vertices level by level, useful for finding shortest paths in unweighted graphs. **Time Complexity:** O(V + E)
- **[Depth-First Search (DFS)](./dfs/)** - Graph traversal that explores as far as possible along each branch before backtracking. **Time Complexity:** O(V + E)
- **[Dijkstra's Algorithm](./dijkstra/)** - Finds shortest paths from source vertex to all other vertices in weighted graphs with non-negative weights. **Time Complexity:** O((V + E) log V)
- **[A* Algorithm](./a-star/)** - Informed search algorithm that uses heuristics to find optimal path between nodes, commonly used in pathfinding. **Time Complexity:** O(b^d) where b is branching factor and d is depth

### **Data Structures**
- **[Priority Queue with Heap](./priority-queue-heap/)** - Binary heap implementation supporting efficient insertion and extraction of maximum/minimum elements. **Time Complexity:** O(log n) for insert/extract
- **[Trie (Prefix Tree)](./trie/)** - Tree-like data structure for efficient storage and retrieval of strings, particularly useful for autocomplete features. **Time Complexity:** O(m) where m is string length
- **[LRU Cache](./lru-cache/)** - Cache implementation that evicts least recently used items when capacity is reached, using hash map and doubly linked list. **Time Complexity:** O(1) for get/put operations

### **Dynamic Programming**
- **[Knapsack Problem](./knapsack/)** - Classic optimization problem solved using dynamic programming to find optimal combination of items within weight constraint. **Time Complexity:** O(n × W) where W is capacity

### **System Design Patterns**
- **[Rate Limiter (Token Bucket)](./rate-limiter/)** - Algorithm for controlling the rate of requests/actions, using token bucket pattern for smooth rate limiting. **Time Complexity:** O(1) for token requests

## 🎯 Purpose

This repository serves multiple purposes:
- **Learning Resource**: Each implementation includes detailed explanations and complexity analysis
- **Interview Preparation**: Classic algorithms commonly asked in technical interviews
- **Code Reference**: Clean, production-ready implementations following Java best practices
- **Career Development**: Demonstrating algorithmic thinking and problem-solving skills

## 🛠️ Technologies Used

- **Language**: Java 17+
- **Build Tool**: InteliJ
- **Documentation**: JavaDoc

*"The best way to learn algorithms is to implement them yourself."* - Happy coding! 💻✨

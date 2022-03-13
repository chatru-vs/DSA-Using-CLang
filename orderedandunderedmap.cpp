The C++ Standard Library provides two map data structures, one named, get this, map, the other, unordered_map.

The map class is implemented using a red-black tree, a binary tree that balances itself when items are added to or removed. When you iterate over a map, you get the sort order of the keys. So if you add C, A, B, or any other order, when you iterate, you will always get A, B, C. If that ordering is what you want, you've got it for free...almost. Searching for an item takes O(log(n)) time, so you pay a price for that ordering by keys.

The unordered_map class is implemented as a hash table. As the name implies, there is no ordering for iteration provided at all. Instead, you get sort of a random order, as the items added scatter across the buckets of the hash table. The benefit of unordered_map over map is that searching for items takes O(1).

So what's to be done if you want fast searches and order-added iteration? Read on!
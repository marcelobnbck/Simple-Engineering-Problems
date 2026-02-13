# Simple-Engineering-Problems
A list of engineering problems that are worth solving.

- Helps engineers to understand what they are doing.
- Helps to build confidence.
- Helps to build up coding skills.
- Helps to build up debugging skills.

## DPK01 Revert String
Create a function that can revert a string.

```markdown
revert("Hello") -> "olleH"
```

## DPK02 Revert a List
Create a function that can revert a list.

```markdown
revert([1,2,3,4,5]) -> [5,4,3,2,1]
```

## DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.

```markdown
lookup(1) -> "John"
```

Refactor the code so you can lookup for email as well and ge the name and vice versa.

```markdown
lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"
```

## DPK04 Simple Pattern Matcher
Given the following countries and languages:

```markdown
Usa -> English
Brazil -> Portuguese
Spain -> Spanish
Italy -> Italian
France -> French
Germany -> German
```

Create a function that can return the language for a given country. You cannot use a hashmap or dictionary.

```markdown
pattern_matcher("Usa") -> "English"
```

Refactor the code, can you do that without using IF statements?

```markdown
pattern_matcher("Usa") -> "English"
```

## DPK05 Pointers
Considering the following hash map:

```markdown
power = {
    "John": 100,
    "Paul": 90,
    "George": 80,
    "Ringo": 70
}
```

Create three functions.

1. Function one should return the power of a given person.
2. Function two should recive 2 names and the with one is the most powerful(should use function one).
3. Function three should recive 2 names and update the leaderboard.

Now the third function that will update the leaderboard after all the matches. i.e Leaderboard should be:

```markdown
leaderboard = {
    "John": 0,
    "Paul": 0,
    "George": 0,
    "Ringo": 0
}
```

Every time a play wins, he scores +10 points, if there is a draw, both players score +5 points. IF one player loses, he scores -5 points.

```markdown
play("John", "Paul") -> "John"
leaderboard -> {
    "John": 10,
    "Paul": -5,
    "George": 0,
    "Ringo": 0
}
```

lets do another round:

```markdown
play("John", "Ringo") -> "John"
leaderboard -> {
    "John": 20,
    "Paul": -5,
    "George": 0,
    "Ringo": -5
}
```

Now can you refactor your code and do less ifs? Maybe introduce pointers?
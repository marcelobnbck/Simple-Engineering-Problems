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
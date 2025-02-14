# a

```mermaid
graph LR
  A((0))
  B((1))
  C((2))
  D((3))
  E((4))
  F((5))

  A --> B
  A <--> C
  A --> E
  B <--> E
  C --> B
  C <--> F
  D <--> B
  E <--> D
  F <--> A
```

{'quant_intersections': 6, 'quant_roads': 9, 'roads': [{
  'intersection': [0, 1], 'direction': 1}, {
  'intersection': [0, 2], 'direction': 2}, {
  'intersection': [0, 4], 'direction': 1}, {
  'intersection': [1, 4], 'direction': 2}, {
  'intersection': [2, 1], 'direction': 1}, {
  'intersection': [2, 5], 'direction': 2}, {
  'intersection': [3, 1], 'direction': 2}, {
  'intersection': [4, 3], 'direction': 2}, {
  'intersection': [5, 0], 'direction': 2}]}

---

Invertendo

```mermaid
graph LR
  A((0))
  B((1))
  C((2))
  D((3))
  E((4))
  F((5))

  B --> A
  E --> A
  B --> C
  A <--> C
  B <--> E
  C <--> F
  D <--> B
  E <--> D
  F <--> A
```

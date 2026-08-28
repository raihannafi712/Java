# Binary tree max — recursion walkthrough

Materials for "Given the root of a binary tree, return the max of all nodes."

## Folder contents

- `visualizations/findMax_recursion_walkthrough.html`
  Step-through visualization of the sentinel-based version (`Integer.MIN_VALUE` base case).

- `visualizations/maxTree_recursion_walkthrough.html`
  Step-through visualization of the zero-based version (`0` base case, matching the
  originally submitted code).

- `code/BinaryTreeMax.java`
  Both implementations side by side, with comments on the base-case tradeoff.

## How to use the visualizations

Open either `.html` file directly in any browser (double-click it, or drag it into a
browser window). No server or internet connection needed — everything is self-contained.
Click "Next" / "Previous" to step through the call stack pushing down the tree and
popping back up as the max value (90) is computed.

## The key difference between the two versions

Both use the same recursive pattern: recurse left, recurse right, compare your own
value against both results, return the largest.

They differ only in what an empty subtree (`root == null`) returns:

- `findMax` returns `Integer.MIN_VALUE` — safe for any tree, including one with
  negative values.
- `maxTree` returns `0` — works fine here because every value in the sample tree is
  positive, but would silently return the wrong answer for a tree of all-negative
  values, since every leaf's max would be compared against `0`.

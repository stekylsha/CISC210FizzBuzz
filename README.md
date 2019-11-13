# CISC210FizzBuzz
It's fizz-buzz.  Well, it's more than just fizz-buzz.  It's also chain of responsibility, strategy, and factory method design patterns as well.  The master branch is the simple version.  `issue-1` branch is the chain of responsibility implementation of master.  `issue-2` branch adds bazz for multiples of 4.  `issue-3` branch outsources the approval to an ApproveStrategy.

Think of it this way, each command in your chain of responsibility is requested to approve or deny some "thing".  In our example, that approval is handled by a strategy that determines if the number is evenly divisible by another.  The strategy could be dynamic, but is not in our case.  If this were authorization, the strategy could be determined by a role, or even the time of day: "If it is after 5 PM, anyone can do X."

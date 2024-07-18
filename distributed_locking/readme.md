# Distributed locking
## Problem
When a shared resource like a database, file, or folder is likely to be accessed by multiple nodes (clients), ensuring data consistency and integrity becomes crucial. Race conditions and deadlocks are unacceptable in such scenarios. These challenges are particularly prominent in the eCommerce(inventory), financial and banking sectors.


Consider distributed locking in situation that the conflicts are likely to happen such as distributed system. 
## Solution
- need to ensure only one client can hold the lock at a time 
- robust when client is down.
- the implemtation should no introduce significant overhead
- ensure fair chace of any client of acquiring the lock

Can be implemented in difference approached such as 
1. centralised: Master–slave model. single point of failure, 
2. token based: complex to implement
3. quorum: used in Radis named The Redlock algorithm. if the client can lock the majority of Radis instances is win. hight fault tolerance and ava. too complex for some usecase
4. leader election: pick the resource leader. can avoid single point of failure but the leader election process can take time and resource.

Example tool
- ZooKeeper. when need high consistency
- etcd
- built-in in PostgreSQL, MongoDB. no good performance
- The Redlock algorithm in Redis. when performance is crucial



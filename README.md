# Definition
* System Design is the process of designing the architecture, components and interfaces for a system so that it meets the end-user requirements

# To Read
 
# Dimensions of System Design
|SNo| #imension  | #Intent |
|:--- | :--- | :--- | 
|1 |Scalability | A solid system must be scalable. This means that it can handle additional load and will operate with efficiency while doing so |
| 2|Reliability |Systems must also be reliable. They perform the way they are supposed to. Systems need to handle user mistakes while performing according to the specified requirements. Reliability also means that unauthorized access to the system can be thwarted  |
| 3|Availability | This is the term used to describe whether or not a system can perform its intended function. Availability can be measured in time (its uptime, for example). The availability of a system is related to its reliability but, make no mistake, it is not the same thing. However, if a system is reliable, it is also available, not but necessarily vice versa |
| 4|Efficiency |A well-designed system is an efficient system. Efficiency means the system performs its functions quickly and reliably. Efficiency is measured with metrics like latency, response time, and bandwidth  |
| 5|Maintainability |A well-designed system must also be easy to maintain over time. This means that the system must also be designed with new engineers in mind. It must be simple enough for them to understand quickly and modify in unanticipated ways.  |


# System Design Basics
* vertical scaling: optimise precision and increase through put with the same resources 
* preprossing (e.g cron job) : prepare before hand during non pick hours 
* Backups: keep backups and avoid single point of failure 
* horizontal scaling: get more resources 
* micro service architecture 
* distributed system (partioning)
* load distribution 
* Decoupling 
* Logging 
* Extensible

# Components of System Design

# System Design -- Gaurav Sen
* [Five common system design interview mistakes](https://www.youtube.com/watch?v=z_YuqLmGZuo&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=18)
* [5 Tips for System Design Interviews](https://www.youtube.com/watch?v=CtmBGH8MkX4&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=15)
* [What is Consistent Hashing and Where is it used?](https://www.youtube.com/watch?v=zaRkONvyGr8&t=326s)
* [What is a Message Queue and Where is it used?](https://www.youtube.com/watch?v=oUJbuFMyBDk)
* [Why do Databases fail? AntiPatterns to avoid!](https://www.youtube.com/watch?v=9T-gNZ5bGCw)
* [How to avoid a single point of failure in distributed systems](https://www.youtube.com/watch?v=-BOysyYErLY)
* [Content Delivery Networks (Simplified)](https://www.youtube.com/watch?v=8zX0rue2Hic)
* [Data Consistency and Tradeoffs in Distributed Systems](https://www.youtube.com/watch?v=m4q7VkgDWrM)
* [What is Database Sharding?](https://www.youtube.com/watch?v=5faMjKuB9bc)
* [What is a microservice architecture and it's advantages?](https://www.youtube.com/watch?v=qYhRvH9tJKw)
* [Moving from Monoliths to Microservices](https://www.youtube.com/watch?v=rckfN7xFig0&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=6)
* [What is the Publisher Subscriber Model?](https://www.youtube.com/watch?v=FMhbR_kQeHw&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=8)
* [What's an Event Driven System?](https://www.youtube.com/watch?v=rJHTK2TfZ1I&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=9)
* [Horizontal vs. Vertical Scaling](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
* [What is Distributed Caching? Explained with Redis!](https://www.youtube.com/watch?v=U3RkDLtS7uY&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=11)
* [Data Consistency and Tradeoffs in Distributed Systems](https://www.youtube.com/watch?v=m4q7VkgDWrM&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=13)
* [How Netflix onboards new content: Video Processing at scale](https://www.youtube.com/watch?v=x9Hrn0oNmJM&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=14)
* [Introduction to NoSQL databases](https://www.youtube.com/watch?v=xQnIN9bW0og&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=16)
* [Tinder as a microservice architecture](https://www.youtube.com/watch?v=tndzLznxq40&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=17)
* [Designing Instagram: System Design of News Feed](https://www.youtube.com/watch?v=QmX2NPkJTKg&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=19)
* [How to avoid cascading failures in a distributed system](https://www.youtube.com/watch?v=xrizarXJgC8&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=20)
* [Whatsapp System Design: Chat Messaging System](https://www.youtube.com/watch?v=vvhC64hQZMk&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=21)
* [Capacity Planning and Estimation: How much data does YouTube store daily?](https://www.youtube.com/watch?v=0myM0k1mjZw&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=23)
* [System Design Interview: TikTok architecture with @sudoCODE](https://www.youtube.com/watch?v=07BVxmVFDGY&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=24)
* [IRCTC System Design](https://www.youtube.com/watch?v=j3etJx7M0Sc)


# System Design Problems
* [Design Vending Machine](https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#axzz4sZVwtCgs)
* [Design URL Shortening Service](https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR?affiliate_id=5073518643380224)
* Design Traffic Control System
* [Design Limit Order Book](https://javarevisited.blogspot.com/2017/03/2-practical-data-structure-algorithm-interview-questions-java.html#axzz7DiOF6kdu)
* Design Website Like Pastebin
* [Create Instagram](https://www.educative.io/courses/grokking-the-system-design-interview/m2yDVZnQ8lG?affiliate_id=5073518643380224)
* Design a Global File Sharing and Storage Apps Like Google Drive or Dropbox
* Design a Chat Application Like Whatsapp or Facebook Messenger
* Design Twitter
* Design Twitter Search
* Design a Global Video Streaming Service Like YouTube or Netflix
* Design an ATM Machine
* Design an API Rate Limiter
* Design a Web Crawler Like Google
* Design Facebook's Newsfeed
* Design Yelp or Nearby Friends
* Design a Global Ride-Hailing Service ( ex : Uber, Grab or Ola Backend )
* Design BookMyShow
* Design a Social Network + Message Board Service ( ex : Quora ) 
* Design an Application Like Airbnb
* Design an Elevator of the Lift System
# Terminology
* Latency = delay in response 
* Synchronous  = happens at the same time
* Asynchronous  = doesn't happen at the same time
* Redundancy  = 
* Resilient  = Recover quickly from difficult conditions
* Availability = System uptime  
* Reliability  = 
* Durability  = 
* Distributed = 
* Scalability  = 
* System Downtime = 
* API vs Event = 
* Leverage  = Use (something) to maximum advantage
* Retention = Holding
* Consistent =  
* Fault Tolerant = fall back
* Batch Processing VS Stream Processing 
* Micro Batch = Batch + Stream, short span of time 
# Reference
* [Grokking the System Design Interview](https://www.educative.io/courses/grokking-the-system-design-interview?affiliate_id=5073518643380224)
* [System Design Primer](https://github.com/donnemartin/system-design-primer/blob/master/README.md)
* [System Design Interview Questions for Java](https://dzone.com/articles/top-20-system-design-interview-questions-for-java)


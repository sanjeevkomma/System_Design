# Definition
* System Design is the process of designing the architecture, components and interfaces for a system so that it meets the end-user requirements

# To Read
 
# Dimensions of System Design
|SNo| #Dimension  | #Intent |
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


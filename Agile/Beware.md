## 填坑手册

### 坑一：团队说它们不想做敏捷

必须先了解和分析现状，摸清痛点。

### 坑二：不理解敏捷背后的意义，把它当作一种新的流程，而忘记它的核心是持续改进

机械地重复Scrum五个会议，烦闷且枯燥。

1. **基础培训！**一知半解地照猫画虎会导致程序僵化。通常，敏捷推进会经历三个阶段：doing agile, thinking agile, being agile。如果只停留在第一阶段就会有这样的问题。
2. **找一个靠谱的敏捷教练。**敏捷本身是一种变革，是从指挥和控制到协作的、以团队为中心的结构性转变，也涉及人的思维和习惯上的改变。是不容易的，需要一个有丰富经验和影响力的人来持续引导。

### 坑三：Scrum过程被严重缩减，只剩下每日站会

在导入者离开后，会议逐渐没人张罗，气氛尴尬，自然省略。因为没有培养出团队合格的Scrum Master。

1. **首先，认识到Scrum Master在敏捷实践中的重要性。**在团队的习惯刚养成还未固化时，一旦教练或者Scrum Master，大家很容易迅速回到解放前。
   - 一个好的Scrum Master在引导（Facilitation)、教育(Teaching)、辅导(Mentoring)、教练(Coaching)这四个方面都有很强的能力，并根据具体情景选择专享的能力，帮助团队体验敏捷，坚定维持团队新养成的敏捷习惯。
2. **其次，要将敏捷推进到底，必须在基层留有敏捷的火种。**
   - 因此在敏捷推进之处，团队就应计划一些列Scrum Master的培养活动，识别出优秀的Scrum Master，然后相互配合着推进敏捷。
   - 在敏捷实践后期，由Scrum Master来负责引导团队，听取敏捷教练的反馈意见。

### 坑四：筒仓中的敏捷

筒仓，原指贮存散装物料的仓库，用在研发领域，指的是公司部门各自为政，不好协调。

敏捷的火种没有传播到其它支持协同的部门。除了开发、测试部门以外，其它各部门之间还是各自为战。如：

- 产品业务部门没有协同，因此对需求的分析理解还是极其缓慢，每次迭代开始时，需求都准备不好，打乱开发节奏。
- 上线运维部门也和开发测试部门割裂，导致虽然开发测试做得很快，但到了上线那一步又变慢了，最终拖慢了整个进程。

还是前期应该多宣讲敏捷的好处，尤其应该推动对高层领导面的宣讲，成立更高级别的敏捷实践督导团。因此，

1. 推进敏捷时要通盘考虑整个链条如何推进（需求-开发-测试-运维）。组织全功能团队，除了一个个敏捷小团队外，还需要考虑需求管理怎么推进，并想好推进策略。
2. 敏捷可以分布推进，但在推进过程中一旦出现新的阻碍，要及时去除。

## 如何防止敏捷变成“小瀑布”？

小瀑布：每四个迭代做一个模块。一个迭代做需求，一个设计，一个开发，一个测试。

真敏捷：有效拆分需求，小到每个都可以在很短的时间内完成开发和测试，如2-3天，且最长不超过一个迭代周期。

这样在开发写代码时，测试也在同步写测试案例，或考虑使用自动化测试方案。需求足够小，就不会有谁在等待的情况造成的浪费。测试开始测试的同时，开发可以继续下一个需求。

### 为什么会变成小瀑布？

1. 没有真正理解敏捷。
2. 单个需求太大。每一步之间还是需要互相等待。
   1. 还有就是工作量超出产能的问题。

### 如何避免？

尽早、持续地交付有价值的软件来使顾客满意。把目标从“三个月做完项目”转变为“3个月做一个让客户满意的产品”，通过持续交付，很大可能在3个月内交付的产品是令他们满意的。以第一个目标来，则不一定。

所以在敏捷中，我们工作的结束点不应该是把之前所有计划的工作做完，而是把客户需要的工作做完。这些工作不一定是一开始就被纳入计划的，但却一定是客户最需要的。

还有就是拆分需求到足够小,并且必须可以独立上线；如果是系统各种耦合就取一定比例的开发时间来重构。

#### 资源

用户故事的公认原则：INVEST原则 - 《用户故事与敏捷方法》


myJAVA
======================================================================
2017.05.14
----------------------------------------------------------------------
* 1个主线程APP和它建立的3个分立线程的程序模型。实践表明，线程优先级并不像
  RTOS中那么起严格地作用。而仅仅是不分级别地都在运行，所以无需指定优先级。

  而认为让主线程拥有最高优先级以确保3个子线程创建完毕之后再运行3个子线程的
  想法实际上不行。事实上，第一个创建完成后，第二个创建之前，第一个已经运行
  了多次，而不是等待主线程完成全部子线程创建之后。
  

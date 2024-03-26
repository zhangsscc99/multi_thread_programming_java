//package com.example.multi_thread_programming_java;
//
//public class SafeSingle {
//    public:
//    SafeSingle* Instance() {
//        Wait(event);
//        if (_ins == nullptr)
//            _ins = new SafeSingle;
//        Release(event);
//        return _ins;
//    }
//    private:
//    static SafeSingle* _ins;
//    static HANDLE event;
//    SafeSingle() { event = CreateEvent(); }
//}

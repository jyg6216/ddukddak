//package kr.or.dduk.chat.controller;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//import lombok.RequiredArgsConstructor;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableWebSocket
//public class WebSocketConfig implements WebSocketConfigurer {
//
//    private final ChattingHandler chattingHandler;
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//    
//        registry.addHandler(chattingHandler, "ddukddak/chat").setAllowedOrigins("*").withSockJS(); // SockJS 사용 시;
//    }
//}
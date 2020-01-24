package ru.kiselevich.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

// говорим, что наш интерфейс будет работать как веб-сервис
@WebService
// говорим, что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    // говорим, что этот метод можно вызывать удаленно
    @WebMethod
    public String getHelloString(String name);

    // возвращает текущее значение или ноль, если метод addAmount() ранее не вызывался для указанного идентификатора
    @WebMethod
    Long getAmount(Integer id);

    // увеличивает значение или устанавливает его, если метод addAmount() был вызван впервые
    @WebMethod
    void addAmount(Integer id, Long value);

}

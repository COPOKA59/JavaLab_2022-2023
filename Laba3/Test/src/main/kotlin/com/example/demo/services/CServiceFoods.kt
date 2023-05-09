package com.example.demo.services

import com.example.demo.model.CFood
import com.example.demo.repositories.CRepositoryFood
import tornadofx.*
import java.util.*

/***********************************************************************************************
 * Сервис с логикой для работы со списком еды.                                                 *
 * @author Макарова П.Ф. 26.03.2023                                                      *
 ***********************************************************************************************/
class CServiceFoods                      : Controller()
{
    private val repositoryFood          : CRepositoryFood by inject()
    /*********************************************************************************************
     * Запрос списка всех доступных объектов на сервере.                                         *
     *********************************************************************************************/
    fun getAll()=repositoryFood.getAll()

    /*******************************************************************************************
     * Отправка данных объекта на сервер.                                                      *
     * @param food - объект для отправки.                                                      *
     *******************************************************************************************/
    fun save(food:CFood)=repositoryFood.save(food)

    /******************************************************************************************
     * Отправка всех данных из списка на сервер.                                              *
     ******************************************************************************************/
    fun saveAll()=repositoryFood.saveAll()

    /*******************************************************************************************
     * Отправка данных объекта на сервер.                                                      *
     * @param food - объект для отправки.                                                      *
     *******************************************************************************************/
    fun add(food:CFood) {
        food.id= UUID.randomUUID()
        repositoryFood.add(food)
    }

    /*******************************************************************************************
     * Отправка данных объекта на сервер.                                                      *
     * @param food - объект для отправки.                                                      *
     *******************************************************************************************/
    fun delete(food:CFood)=repositoryFood.delete(food)
}
package ru.psu.java.laba2.makmikcro.services

import org.springframework.http.ResponseEntity
import ru.psu.java.laba2.makmikcro.model.CFood
import ru.psu.java.laba2.makmikcro.model.IDateWithCounter
import java.time.LocalDate
import java.util.*

/*****************************************************************
 * Интерфейс сервиса с бизнес-логикой для работы со списком еды. *
 * @author Макарова П.Ф. 12.03.2023                              *
 *****************************************************************/

interface IServiceFoods {
    /*************************************************************
     * Список всей еды.                                          *
     *************************************************************/
    fun getAll(): Iterable<CFood>
    /*************************************************************
     * Поиск еды по идентификатору.                              *
     * @param id - идентификатор еды для поиска в формате UUID.  *
     *************************************************************/
    fun getById(id: UUID): ResponseEntity<CFood>
    /*************************************************************
     * Поиск еды по названию.                                    *
     * @param name - название еды для поиска в формате String.   *
     *************************************************************/
    fun getByName(name: String) : Iterable<CFood>
    /*************************************************************
     * Поиск еды по калориям.                                    *
     * @param kal - калории еды для поиска в формате Double.     *
     *************************************************************/
    fun getByKal(kal: Double) : Iterable<CFood> //Double
    /*************************************************************
     * Поиск дней с определённой едой(Бананы).                   *
     *************************************************************/
    fun getByDayN() : List<CFood>

    fun getWithMaxFoods()                : List<IDateWithCounter>

    /*************************************************************
     * Создание/изменение еды.                                   *
     * @param food - данные еды.                                 *
     *************************************************************/
    fun save(food: CFood)
    /*************************************************************
     * Удаление еды.                                             *
     * @param food - данные еды.                                 *
     *************************************************************/
    fun delete(food: CFood)
    /*************************************************************
     * Удаление еды по идентификатору.                           *
     * @param id - идентификатор еды для удаления.               *
     *************************************************************/
    fun deleteById(id: UUID): String
}
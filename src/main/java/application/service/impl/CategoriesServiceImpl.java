package application.service.impl;

import application.dao.CategoriesDAO;
import application.service.CategoriesService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CategoriesServiceImpl implements CategoriesService {

    @Inject
    private CategoriesDAO categoriesDAO;
}

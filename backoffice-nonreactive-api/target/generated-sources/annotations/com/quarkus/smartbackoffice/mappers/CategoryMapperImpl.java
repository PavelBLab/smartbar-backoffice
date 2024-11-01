package com.quarkus.smartbackoffice.mappers;

import com.quarkus.smartbackoffice.persistence.entity.Category;
import com.quarkus.smartbackoffice.provider.models.CategoryDto;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T19:22:26+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public List<CategoryDto> mapToCategoryDtos(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( categories.size() );
        for ( Category category : categories ) {
            list.add( mapToCategoryDto( category ) );
        }

        return list;
    }

    @Override
    public CategoryDto mapToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto.CategoryDtoBuilder<?, ?> categoryDto = CategoryDto.builder();

        categoryDto.name( category.getName() );
        categoryDto.description( category.getDescription() );

        return categoryDto.build();
    }

    @Override
    public List<Category> mapToCategories(List<CategoryDto> categoryDtos) {
        if ( categoryDtos == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryDtos.size() );
        for ( CategoryDto categoryDto : categoryDtos ) {
            list.add( mapToCategory( categoryDto ) );
        }

        return list;
    }

    @Override
    public Category mapToCategory(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.name( categoryDto.getName() );
        category.description( categoryDto.getDescription() );

        return category.build();
    }
}

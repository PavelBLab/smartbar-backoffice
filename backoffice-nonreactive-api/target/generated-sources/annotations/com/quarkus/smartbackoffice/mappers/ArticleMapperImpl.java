package com.quarkus.smartbackoffice.mappers;

import com.quarkus.smartbackoffice.persistence.entity.Article;
import com.quarkus.smartbackoffice.provider.models.ArticleDto;
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
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public List<ArticleDto> mapToArticleDtos(List<Article> articles) {
        if ( articles == null ) {
            return null;
        }

        List<ArticleDto> list = new ArrayList<ArticleDto>( articles.size() );
        for ( Article article : articles ) {
            list.add( mapToArticleDto( article ) );
        }

        return list;
    }

    @Override
    public ArticleDto mapToArticleDto(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleDto.ArticleDtoBuilder<?, ?> articleDto = ArticleDto.builder();

        articleDto.name( article.getName() );
        articleDto.price( article.getPrice() );
        articleDto.description( article.getDescription() );
        articleDto.picture( article.getPicture() );

        return articleDto.build();
    }

    @Override
    public List<Article> mapToArticles(List<ArticleDto> articleDtos) {
        if ( articleDtos == null ) {
            return null;
        }

        List<Article> list = new ArrayList<Article>( articleDtos.size() );
        for ( ArticleDto articleDto : articleDtos ) {
            list.add( mapToArticle( articleDto ) );
        }

        return list;
    }

    @Override
    public Article mapToArticle(ArticleDto articleDto) {
        if ( articleDto == null ) {
            return null;
        }

        Article.ArticleBuilder article = Article.builder();

        article.name( articleDto.getName() );
        article.price( articleDto.getPrice() );
        article.description( articleDto.getDescription() );
        article.picture( articleDto.getPicture() );

        return article.build();
    }
}

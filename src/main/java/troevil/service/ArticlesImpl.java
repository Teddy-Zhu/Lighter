package troevil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.ArticleMapper;
import troevil.interfaces.ArticlesI;
import troevil.model.Article;

@Service("articleService")
public class ArticlesImpl implements ArticlesI {

	private ArticleMapper articleMapper;

	public ArticleMapper getArticleMapper() {
		return articleMapper;
	}

	@Autowired
	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
	public List<Article> getAllArticle(String typestatusname, Integer start,
			Integer end) {
		return articleMapper.getAllArticle(typestatusname, start, end);
	}

	@Override
	public Integer getnumber(String typestatusname) {
		return articleMapper.getnumber(typestatusname);
	}

	@Override
	public Integer insertarticle(Article record) {
		return articleMapper.insertSelective(record);
	}

}

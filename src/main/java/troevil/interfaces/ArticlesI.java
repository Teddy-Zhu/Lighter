package troevil.interfaces;

import java.util.List;

import troevil.model.Article;

public interface ArticlesI {

	public List<Article> getAllArticle(String typestatusname, Integer start,
			Integer end);

	public Integer getnumber(String typestatusname);

	public Integer insertarticle(Article record);

}

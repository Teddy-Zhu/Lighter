package troevil.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import troevil.model.Article;

public interface ArticleMapper {
	int deleteByPrimaryKey(Integer articleid);

	int insert(Article record);

	int insertSelective(Article record);

	Article selectByPrimaryKey(Integer articleid);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);

	List<Article> getAllArticle(@Param("statusname") String statusname,
			@Param("start") Integer start, @Param("end") Integer end);

	Integer getnumber(String statusname);
}
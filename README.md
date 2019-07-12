
# **Markdown的使用**
# Examples
# Text
It's very easy to make some words **bold** and other words *italic* with Markdown. You can even [link to Google!](http://google.com)

## Syntax guide

Here’s an overview of Markdown syntax that you can use anywhere on GitHub.com or in your own text files.
## Headers

# This is an <h1> tag
## This is an <h2> tag
###### This is an <h6> tag

## Emphasis


*This text will be italic*
_This will also be italic_

**This text will be bold**__This will also be bold__

_You **can** combine them_
## Lists

### Unordered

* Item 1
* Item 2
  * Item 2a
  * Item 2b
###   Ordered
1. Item 1
1. Item 2
1. Item 3
   1. Item 3a
   1. Item 3b
## Images
![GitHub Logo](/images/logo.png)
Format: ![Alt Text](url)
##
![Open vSwitch Logo](/images/d7483921a999247a483d1f911a69d32b.png
)
Format: ![Alt Text](url)
! !Open vSwitch (/images/![d7483921a999247a483d1f911a69d32b.png](en-resource://database/2345:1))
## Links
http://github.com - automatic!
[GitHub](http://github.com)


## Blockquotes
As Kanye West said:

> We're living the future so
> > the present is our past.


## Inline code
I think you should use an
`<addr>` element here instead.

## GitHub Flavored Markdown
GitHub.com uses its own version of the Markdown syntax that provides an additional set of useful features, many of which make it easier to work with content on GitHub.com.

Note that some features of GitHub Flavored Markdown are only available in the descriptions and comments of Issues and Pull Requests. These include @mentions as well as references to SHA-1 hashes, Issues, and Pull Requests. Task Lists are also available in Gist comments and in Gist Markdown files.


### Syntax highlighting

Here’s an example of how you can use syntax highlighting with GitHub Flavored Markdown:


```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```


You can also simply indent your code by four spaces:

###### **一个空行+4个空格**

    function fancyAlert(arg) {
      if(arg) {
        $.facebox({div:'#foo'})
      }
    }

Here’s an example of Python code without syntax highlighting: 

    def foo():
        if not bar:
            return True

## Task Lists

- [x] 打对勾
- [x] @mentions, #refs, [links](), **formatting**, and <del>tags</del> supported
- [x] list syntax required (any unordered or ordered list supported)
- [x] this is a complete item
- [ ] this is an incomplete item

If you include a task list in the first comment of an Issue, you will get a handy progress indicator in your issue list. It also works in Pull Requests!

## Tables
You can create tables by assembling a list of words and dividing them with hyphens - (for the first row), and then separating each column with a pipe |:
表头后下一行加-|-即可

First Header | Second Header
------------ | -------------
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column
  
 First Header | Second Header
 -|-
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column

## SHA references
Any reference to a commit’s [SHA-1 hash](
https://en.wikipedia.org/wiki/SHA-1) will be automatically converted into a link to that commit on GitHub.

16c999e8c71134401a78d4d46435517b2271d6ac
mojombo@16c999e8c71134401a78d4d46435517b2271d6ac
mojombo/github-flavored-markdown@16c999e8c71134401a78d4d46435517b2271d6ac

## Issue references within a repository
Any number that refers to an Issue or Pull Request will be automatically converted into a link.
任何引用Issue或Pull Request的数字都将自动转换为链接
#1
mojombo#1
mojombo/github-flavored-markdown#1

## Username @mentions


Typing an @ symbol, followed by a username, will notify that person to come and view the comment. This is called an “@mention”, because you’re mentioningthe individual. You can also @mention teams within an organization.
键入@符号，后跟用户名，将通知该人来查看评论。 这被称为“@mention”，因为你提到的是个人。 您还可以在组织内@mention团队。

@swiftchao

## Automatic linking for URLs
Any URL (like http://www.github.com/) will be automatically converted into a clickable link.
Any URL (like http://www.github.com/) will be automatically converted into a clickable link.


## Strikethrough删除线
Any word wrapped with two tildes (like ~~this~~) will appear crossed out.
前后两个波浪线这是要~~删除线标记要删除的位置前后两个波浪线~~的内容。

## Emoji
GitHub supports [emoji](
https://help.github.com/en/articles/basic-writing-and-formatting-syntax#using-emoji)!To see a list of every image we support, check out the [Emoji Cheat Sheet](
https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md).

@octocat :+1: This PR looks great - it's ready to merge! :shipit:


Using emojiYou can add emoji to your writing by typing&nbsp;:EMOJICODE:.
@octocat :+1: This PR looks great - it&apos;s ready to merge! :shipit:![9fc01d4d4ceaf267ea99b4592d94c594.png](en-resource://database/2347:1)

![09e0d377b343cfde71f62b1a8155f11d.png](en-resource://database/2387:1)

# lists


Sometimes you want numbered lists:

1. One
2. Two
3. Three

Sometimes you want bullet points:

* Start a line with a star
* Profit!

Alternatively,

- Dashes work just as well
- And if you have sub points, put two spaces before the dash or star:
  - Like this
  - And this
  
# Images

If you want to embed images, this is how you do it:

![Image of Yaktocat](https://octodex.github.com/images/yaktocat.png)
# Headers & Quotes

# Structured documents

Sometimes it's useful to have different levels of headings to structure your documents. Start lines with a `#` to create headings. Multiple `##` in a row denote smaller heading sizes.

### This is a third-tier heading

You can use one `#` all the way up to `######` six for different heading sizes.

If you'd like to quote someone, use the > character before the line:

> Coffee. The finest organic suspension ever devised... I beat the Borg with it.
> - Captain Janeway
＃结构化文件

有时，使用不同级别的标题来构建文档是有用的。 用`#`开始行创建标题。 连续多个`##`表示较小的标题大小。

###这是第三层标题

对于不同的标题尺寸，你可以使用一个`＃`一直到`######`六。

如果您想引用某人，请在该行前使用>字符：

>咖啡。 有史以来最好的有机悬浮液......我用它击败了博格。
>  -  Janeway队长

# Code

There are many different ways to style code with GitHub's markdown. If you have inline code blocks, wrap them in backticks: `var example = true`.  If you've got a longer block of code, you can indent with four spaces:
使用GitHub的降价来设置代码的方式有很多种。 如果你有内联代码块，请用反引号包装它们：`var example = true`。 如果你有一个更长的代码块，你可以缩进四个空格：

    if (isAwesome){
      return true
    }

GitHub also supports something called code fencing, which allows for multiple lines without indentation:
GitHub还支持称为代码防护的东西，它允许多行而不缩进：

```
if (isAwesome){
  return true
}
```

And if you'd like to use syntax highlighting, include the language:
如果您想使用语法突出显示，请包含以下语言：

```javascript
if (isAwesome){
  return true
}
```

There are many different ways to style code with GitHub’s markdown. If you have inline code blocks, wrap them in backticks: var example = true. If you’ve got a longer block of code, you can indent with four spaces:

使用GitHub的降价来设置代码的方式有很多种。 如果你有内联代码块，请用反引号将它们包装起来：var example = true。 如果你有一个更长的代码块，你可以缩进四个空格：

    if (isAwesome){
      return true
    }
GitHub also supports something called code fencing, which allows for multiple lines without indentation:
GitHub还支持称为代码防护的东西，它允许多行而不缩进：
```
if (isAwesome){
  return true
}
```
And if you’d like to use syntax highlighting, include the language:
如果您想使用语法突出显示，请包含以下语言：
```java
if (isAwesome){
  return true}
```
```c
if (isAwesome){
  return true}
```
```python
if (isAwesome){
  return true}
```
```sh
if (isAwesome){
  return true}
```
```c++
if (isAwesome){
  return true}
```

```javascript
  var ihubo = {
    nickName  : "草依山",
    site : "http://jser.me"
  }
```

# Extras

GitHub supports many extras in Markdown that help you reference and link to people. If you ever want to direct a comment at someone, you can prefix their name with an @ symbol: Hey @kneath — love your sweater!

But I have to admit, tasks lists are my favorite:

- [x] This is a complete item
- [ ] This is an incomplete item

When you include a task list in the first comment of an Issue, you will see a helpful progress bar in your list of issues. It works in Pull Requests, too!

And, of course emoji!

GitHub支持Markdown中的许多附加功能，可以帮助您引用和链接到人。 如果你想对某人发表评论，你可以在他们的名字前加上@符号：嘿@kneath-爱你的毛衣！

但我必须承认，任务列表是我最喜欢的：

 -  [x]这是一个完整的项目
 -  []这是一个不完整的项目

当您在问题的第一条评论中包含任务列表时，您会在问题列表中看到一个有用的进度条。 它也适用于Pull Requests！

而且，当然是表情符号！
* 预览区域`代码高亮`
/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AParentesesParenteses extends PParenteses
{
    private TAParenteses _aParenteses_;
    private PExpressaoLogica _expressaoLogica_;
    private TFParenteses _fParenteses_;

    public AParentesesParenteses()
    {
        // Constructor
    }

    public AParentesesParenteses(
        @SuppressWarnings("hiding") TAParenteses _aParenteses_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TFParenteses _fParenteses_)
    {
        // Constructor
        setAParenteses(_aParenteses_);

        setExpressaoLogica(_expressaoLogica_);

        setFParenteses(_fParenteses_);

    }

    @Override
    public Object clone()
    {
        return new AParentesesParenteses(
            cloneNode(this._aParenteses_),
            cloneNode(this._expressaoLogica_),
            cloneNode(this._fParenteses_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParentesesParenteses(this);
    }

    public TAParenteses getAParenteses()
    {
        return this._aParenteses_;
    }

    public void setAParenteses(TAParenteses node)
    {
        if(this._aParenteses_ != null)
        {
            this._aParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParenteses_ = node;
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public TFParenteses getFParenteses()
    {
        return this._fParenteses_;
    }

    public void setFParenteses(TFParenteses node)
    {
        if(this._fParenteses_ != null)
        {
            this._fParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fParenteses_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParenteses_)
            + toString(this._expressaoLogica_)
            + toString(this._fParenteses_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aParenteses_ == child)
        {
            this._aParenteses_ = null;
            return;
        }

        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._fParenteses_ == child)
        {
            this._fParenteses_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aParenteses_ == oldChild)
        {
            setAParenteses((TAParenteses) newChild);
            return;
        }

        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        if(this._fParenteses_ == oldChild)
        {
            setFParenteses((TFParenteses) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
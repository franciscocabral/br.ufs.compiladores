/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoRelacionalExpressaoRelac extends PExpressaoRelac
{
    private PParenteses _parenteses_;
    private PSinalIgualdade _sinalIgualdade_;
    private PParenteses2 _parenteses2_;

    public AExpressaoRelacionalExpressaoRelac()
    {
        // Constructor
    }

    public AExpressaoRelacionalExpressaoRelac(
        @SuppressWarnings("hiding") PParenteses _parenteses_,
        @SuppressWarnings("hiding") PSinalIgualdade _sinalIgualdade_,
        @SuppressWarnings("hiding") PParenteses2 _parenteses2_)
    {
        // Constructor
        setParenteses(_parenteses_);

        setSinalIgualdade(_sinalIgualdade_);

        setParenteses2(_parenteses2_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoRelacionalExpressaoRelac(
            cloneNode(this._parenteses_),
            cloneNode(this._sinalIgualdade_),
            cloneNode(this._parenteses2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoRelacionalExpressaoRelac(this);
    }

    public PParenteses getParenteses()
    {
        return this._parenteses_;
    }

    public void setParenteses(PParenteses node)
    {
        if(this._parenteses_ != null)
        {
            this._parenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteses_ = node;
    }

    public PSinalIgualdade getSinalIgualdade()
    {
        return this._sinalIgualdade_;
    }

    public void setSinalIgualdade(PSinalIgualdade node)
    {
        if(this._sinalIgualdade_ != null)
        {
            this._sinalIgualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinalIgualdade_ = node;
    }

    public PParenteses2 getParenteses2()
    {
        return this._parenteses2_;
    }

    public void setParenteses2(PParenteses2 node)
    {
        if(this._parenteses2_ != null)
        {
            this._parenteses2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteses2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parenteses_)
            + toString(this._sinalIgualdade_)
            + toString(this._parenteses2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parenteses_ == child)
        {
            this._parenteses_ = null;
            return;
        }

        if(this._sinalIgualdade_ == child)
        {
            this._sinalIgualdade_ = null;
            return;
        }

        if(this._parenteses2_ == child)
        {
            this._parenteses2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parenteses_ == oldChild)
        {
            setParenteses((PParenteses) newChild);
            return;
        }

        if(this._sinalIgualdade_ == oldChild)
        {
            setSinalIgualdade((PSinalIgualdade) newChild);
            return;
        }

        if(this._parenteses2_ == oldChild)
        {
            setParenteses2((PParenteses2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
